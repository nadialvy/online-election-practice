package week14;

public class Election {
  public static void main(String[] args) {
    Candidate candidateOne = new Candidate(1, "Panji Raditya");
    Candidate candidateTwo = new Candidate(2, "Arif-Prasetyo");
    Candidate[] candidateArrays = { candidateOne, candidateTwo };

    Voter voterOne = new Voter(11, "Rizki");
    Voter voterTwo = new Voter(22, "Khoirul");
    Voter voterThree = new Voter(33, "Ananta");

    VotingSystem canAry = new VotingSystem(candidateArrays);

    voterOne.vote(candidateOne);
    voterTwo.vote(candidateTwo);
    voterThree.vote(candidateOne);
    voterOne.vote(candidateTwo);

    System.out.println("=====================================");
    canAry.displayVoteCount();
    System.out.println("=====================================");
    canAry.displayWinner();

  }

}