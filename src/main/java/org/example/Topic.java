package org.example;

import java.util.*;

public class Topic extends CentralTopic {
    List<Topic> relationshipedTopic;
    Topic(String _title) {
        super(_title);
        relationshipedTopic = new ArrayList<Topic>();
    }

    void addRelationship(Topic relatedTopic) {
        relationshipedTopic.add(relatedTopic);
    }

    void removeRelationship(Topic relatedTopic) {
        relationshipedTopic.remove(relatedTopic);
    }
}
