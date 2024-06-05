package week14;

public class Voter {
  private int id;
  private String name;
  private boolean hasVoted = false;

  public Voter(int id, String name) {
    this.id = id;
    this.name = name;
  }

  public int getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void vote(Candidate c) {
    if (hasVoted) {
      System.out.println("Hello " + c.getName() + ", you have previously casted your vote and cannot vote again.");
    } else {
      c.addVote();
      hasVoted = true;
      System.out.println("Hello " + c.getName() + ", thank you for casting your vote");
    }
  }
}
