package week14;

public class Candidate {
  private int id;
  private String name;
  private int votes = 0;

  public Candidate(int id, String name){
    this.id = id;
    this.name = name;
  }

  public int getId(){
    return id;
  }

  public String getName(){
    return name;
  }

  public int getVotes(){
    return votes;
  }

  public void addVote(){
    votes++;
  }
}
