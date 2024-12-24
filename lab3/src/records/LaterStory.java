package records;

public record LaterStory(String content) {
    public void Display(){
        System.out.println("\n\nПродолжение истории: " + content);
    }

}
