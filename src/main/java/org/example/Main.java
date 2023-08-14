package org.example;

public class Main {
    public static void main(String[] args) {
        CentralTopic c = new CentralTopic("Employee Engagement");
        c.appendChild(new Topic("This is child 1"));
        c.appendChild(new Topic("This is child 2"));

        Topic subtopic1 = new Topic("Sub Topic 1");
        Topic subtopic2 = new Topic("Sub Topic 2");
        Topic subtopic3 = new Topic("Sub Topic 3");

        c.children.get(0).appendChild(subtopic1);
        c.children.get(0).appendChild(subtopic2);
        c.children.get(0).appendChild(subtopic3);

        Topic mainTopic1 = c.children.get(0);
        mainTopic1.addRelationship(subtopic3);
        System.out.print(mainTopic1.relationshipedTopic.get(0).title);
        c.moveChildToOtherChild(c.children.get(1), c.children.get(0));
        Topic child2 = c.children.get(0);
       // System.out.print(child2.children.get(0).title);
    }
}