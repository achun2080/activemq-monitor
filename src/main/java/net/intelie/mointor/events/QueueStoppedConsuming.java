package net.intelie.mointor.events;

/**
 *
 */
public class QueueStoppedConsuming implements Event {

    private String queueName;

    public QueueStoppedConsuming(String queueName) {
        this.queueName = queueName;
    }

    public String getQueueName() {
        return queueName;
    }

}
