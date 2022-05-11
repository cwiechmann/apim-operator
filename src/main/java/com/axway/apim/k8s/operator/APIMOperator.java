package com.axway.apim.k8s.operator;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.fabric8.kubernetes.client.Config;
import io.fabric8.kubernetes.client.ConfigBuilder;
import io.fabric8.kubernetes.client.DefaultKubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClient;
import io.javaoperatorsdk.operator.Operator;

public class APIMOperator {
	
	private static final Logger LOG = LoggerFactory.getLogger(APIMOperator.class);

	public static void main(String[] args) throws IOException {
		
		Config config = new ConfigBuilder().withNamespace(null).build();
		KubernetesClient client = new DefaultKubernetesClient(config);
		Operator operator = new Operator(client);
		operator.register(new APIReconciler());
		operator.installShutdownHook();
		operator.start();
	}

}
