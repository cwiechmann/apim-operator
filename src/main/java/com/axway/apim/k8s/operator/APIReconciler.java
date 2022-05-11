package com.axway.apim.k8s.operator;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.javaoperatorsdk.operator.api.reconciler.Context;
import io.javaoperatorsdk.operator.api.reconciler.ControllerConfiguration;
import io.javaoperatorsdk.operator.api.reconciler.Reconciler;
import io.javaoperatorsdk.operator.api.reconciler.UpdateControl;

@ControllerConfiguration()
public class APIReconciler implements Reconciler<API> {
	
	private static final Logger LOG = LoggerFactory.getLogger(APIReconciler.class);

	@Override
	public UpdateControl<API> reconcile(API api, Context<API> context) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	

}
