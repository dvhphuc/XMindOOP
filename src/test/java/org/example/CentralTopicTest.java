package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CentralTopicTest {
    CentralTopic centralTopic = new CentralTopic("Central Topic");
    @Test
    void testCreateTopic() {
        assertEquals("Central Topic",centralTopic.title);
    }

    @Test
    void testAppendChild() {
        Topic mainTopic1 = new Topic("Main Topic 1");
        Topic mainTopic2 = new Topic("Main Topic 2");
        Topic mainTopic3 = new Topic("Main Topic 3");

        centralTopic.appendChild(mainTopic1);
        centralTopic.appendChild(mainTopic2);
        centralTopic.appendChild(mainTopic3);

        assertEquals(3,centralTopic.children.size());
    }

    @Test
    void testAppendSubChild() {
        Topic mainTopic1 = new Topic("Main Topic 1");
        centralTopic.appendChild(mainTopic1);

        Topic subTopic1 = new Topic("Sub Topic 1");
        Topic subTopic2 = new Topic("Sub Topic 1");
        centralTopic.children.get(0).appendChild(subTopic1);
        centralTopic.children.get(0).appendChild(subTopic2);

        assertEquals(2,centralTopic.children.get(0).children.size());
    }

    @Test
    void testRemoveChild() {
        centralTopic.appendChild(new Topic("Main Topic 1"));
        centralTopic.appendChild(new Topic("Main Topic 2"));

        Topic mainTopic1 = centralTopic.children.get(0); //Get MainTopic1 in CentralTopic

        centralTopic.removeChild(mainTopic1);

        assertEquals(1,centralTopic.children.size());
    }

    @Test
    void testMoveChild2OtherChild() {
        Topic mainTopic1 = new Topic("Main Topic 1");
        Topic mainTopic2 = new Topic("Main Topic 2");
        centralTopic.appendChild(mainTopic1);
        centralTopic.appendChild(mainTopic2);

        centralTopic.moveChildToOtherChild(mainTopic1,mainTopic2);

        assertEquals(1,centralTopic.children.size());
        assertEquals(1,mainTopic1.children.size());
    }

    @Test
    void testAddRelationship() {
        Topic mainTopic1 = new Topic("Main Topic 1");
        Topic mainTopic2 = new Topic("Main Topic 2");
        centralTopic.appendChild(mainTopic1);
        centralTopic.appendChild(mainTopic2);

        mainTopic1.addRelationship(mainTopic2);

        assertEquals(1,mainTopic1.relationshipedTopic.size());
    }

    @Test
    void removeRaltionship() {
        Topic mainTopic1 = new Topic("Main Topic 1");
        Topic mainTopic2 = new Topic("Main Topic 2");
        centralTopic.appendChild(mainTopic1);
        centralTopic.appendChild(mainTopic2);

        mainTopic1.addRelationship(mainTopic2);

        assertEquals(1,mainTopic1.relationshipedTopic.size());

        mainTopic1.removeRaltionship(mainTopic2);

        assertEquals(0,mainTopic1.relationshipedTopic.size());
    }
}