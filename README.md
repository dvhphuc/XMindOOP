# XMindOOP
Design OOP Patterns for XMind

### Folder Structure
  - **class**: src/main/java/org.example
  - **unit test**: src/test/java/org.example

### Class Structure
1. Central Topic:
    - Properties: title, list of children Topic
    - Methods:
       + appendChild: add a Topic to the Central Topic, the children list of Central Topic will be increased 1 after adding
       + removeChild: remove a Topic from the Central Topic, the children list of Central Topic will be decrease 1 after removing
       + moveChildToOtherChild: move a Topic and all of children to another Topic
       + addRelationship: a Topic can have a relationship to each others
       + removeRelationship: remove the relationship from a Topic
2. Topic
   This class is inheritance class from Central Topic
