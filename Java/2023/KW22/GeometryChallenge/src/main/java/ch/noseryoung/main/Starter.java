package ch.noseryoung.main;

public class Starter {

  public static void main(String[] args) {

    SideCreatorService creatorService = new SideCreatorService();
    TriangleManager sm = new TriangleManager(creatorService);
    sm.run();

    // todo: print all sorted Triangles
    System.out.println("SHORTEST SIDES");
    for (Triangle t : sm.getAllTrianglesSortedByShortestSide()){
      System.out.println(t.getShortestSide(t));
    }

    System.out.println("LONGEST SIDES");
    for (Triangle t : sm.getAllTrianglesSortedByLongestSide()){
      System.out.println(t.getLongestSide(t));
    }
  }
}
