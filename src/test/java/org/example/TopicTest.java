package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TopicTest {
    @Test
    void testAddRelationship(Topic relatedTopic)
    {
        Topic mainTopic1 = new Topic("Main Topic 1");
        mainTopic1.addRelationship(relatedTopic);
    }
}