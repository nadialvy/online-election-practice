package week14;

public class Election {
  Candidate candidateOne = new Candidate(1, "Panji Raditya");
  Candidate candidateTwo = new Candidate(2, "Arif-Prasetyo");
  Candidate[] candidateArrays = { candidateOne, candidateTwo };

  Voter voterOne = new Voter(11, "Rizki");
  Voter voterTwo = new Voter(22, "Khoirul");
  Voter voterThree = new Voter(33, "Ananta");

  VotingSystem canAry = new VotingSystem(candidateArrays);

  public void vote() {
    voterOne.vote(candidateOne);
  }

  public static void main(String[] args) {
    Election election = new Election();
    election.vote();
    election.canAry.displayVoteCount();
    election.canAry.displayWinner();
  }
}
