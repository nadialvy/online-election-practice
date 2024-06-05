package week14;

public class VotingSystem {
  private Candidate[] candidates;

  public VotingSystem(Candidate[] candidates) {
    this.candidates = candidates;
  }

  public void displayVoteCount() {
    for (int i = 0; i < candidates.length; i++) {
      System.out.println(candidates[i].getId() + " " + candidates[i].getName() + ": " + candidates[i].getVotes());
    }
  }

  public void displayWinner() {
    String tempWinnerName = "";
    int tempWinnerTotalVote = 0;

    for (int i = 0; i < candidates.length; i++) {
      if (tempWinnerTotalVote < candidates[0].getVotes()) {
        tempWinnerTotalVote = candidates[0].getVotes();
        tempWinnerName = candidates[0].getName();
      }
    }

    System.out.println(
        "The winner of the election is " + tempWinnerName + "with a total vote of " + tempWinnerTotalVote + ".");
  }
}
