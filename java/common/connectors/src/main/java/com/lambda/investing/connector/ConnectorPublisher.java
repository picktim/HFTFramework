package com.lambda.investing.connector;

import com.lambda.investing.model.messaging.TypeMessage;

import java.io.Serializable;

public interface ConnectorPublisher {

	boolean publish(ConnectorConfiguration connectorConfiguration, TypeMessage typeMessage, String topic,
					Serializable message);

	int getMessagesSent(ConnectorConfiguration configuration);
	int getMessagesFailed(ConnectorConfiguration configuration);

}
