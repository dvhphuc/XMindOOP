package org.example;

import java.util.*;

public class CentralTopic {
    String title;
    public  List<Topic> children;
    CentralTopic(String _title) {
        this.title = _title;
        this.children = new ArrayList<Topic>();
    }

    void appendChild(Topic child) {
        this.children.add(child);
    }

    void removeChild(Topic child) {
        this.children.remove(child);
    }

    void moveChildToOtherChild(Topic parentTopic, Topic movedTopic) {
        removeChild(movedTopic);
        parentTopic.appendChild(movedTopic);
    }

}
