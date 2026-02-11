import java.util.Arrays;

public class ArrayAverages
{
  
  int[][] ray;

  public ArrayAverages(int[][] rayray)
  {
    ray = rayray;
  }

  public void rowAverages()
  {
    double sum = 0;

    for(int row=0; row<ray.length; row++)
    {
      sum = 0;

      for(int col=0; col<ray[row].length; col++)
      {
        sum+=ray[row][col];
      }
      double rowAvg = sum/ray[0].length;
      System.out.println("The average of row " + row + " is: " +  rowAvg);
    }
  }

  public void columnAverages()
  {
    //Column major order
    //   Take each column and go through all of the rows
    //   Top down and Left to Right
    double sum = 0;   

    for(int col=0; col<ray[0].length; col++)
    {
      sum = 0;

      for(int row=0; row<ray.length; row++)
        {
          sum+=ray[row][col];
        }
      double colAvg = sum/ray.length;
      System.out.println("The average of column " + col + " is: " +  colAvg);
    }
  }

  public void arrayAverage()
  {
    double sum = 0;

    for(int row=0; row<ray.length; row++)
    {
      for(int col=0; col<ray[row].length; col++)
      {
        sum+=ray[row][col];
      }
    }
    double rayAvg = sum/(ray.length*ray[0].length);
    System.out.println("The average of the array is: " +  rayAvg);
  }

  public String toString()
  {
    for(int row=0; row<ray.length; row++)
    {
      System.out.println(Arrays.toString(ray[row]));
    }
    return "";
  }
}
