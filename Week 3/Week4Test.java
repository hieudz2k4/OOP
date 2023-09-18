import org.junit.Test;
import org.junit.Assert;

public class Week4Test {
    @Test
    public void testMax2Int1(){
        Assert.assertEquals(Week4.max2Int(6, 8), 8);
    }

    @Test
    public void testMax2Int2(){
        Assert.assertEquals(Week4.max2Int(0, 0), 0);
    }

    @Test
    public void testMax2Int3(){
        Assert.assertEquals(Week4.max2Int(1, 2), 2);
    }

    @Test
    public void testMax2Int4(){
        Assert.assertEquals(Week4.max2Int(-1, -3), -1);
    }

    @Test
    public void testMax2Int5(){
        Assert.assertEquals(Week4.max2Int(1, 10), 10);
    }

    @Test
    public void testMinArray1(){
        int[] arr = {0};
        Assert.assertEquals(Week4.minArray(arr), 0);
    }

    @Test
    public void testMinArray2(){
        int[] arr = {1, 2};
        Assert.assertEquals(Week4.minArray(arr), 1);
    }

    @Test
    public void testMinArray3(){
        int[] arr = {-1, 1, 4, 5}
        Assert.assertEquals(Week4.minArray(arr), -1);
    }

    @Test
    public void testMinArray4(){
        int[] arr = {1, 2, 3, 4, 1}
        Assert.assertEquals(Week4.minArray(arr), 1);
    }

    @Test
    public void testMinArray5(){
        int[] arr = {1,1,1,1,1,1,1,1,1,1,1,1,1};
        Assert.assertEquals(Week4.minArray(arr), 1);
    }

    @Test
    public void testCalculateBMI1(){
        Assert.assertEquals(Week4.calculateBMI(65.0, 1.8), "Bình thường");
    }

    @Test
    public void testCalculateBMI2(){
        Assert.assertEquals(Week4.calculateBMI(50, 1.75), "Thiếu cân");
    }

    @Test
    public void testCalculateBMI3(){
        Assert.assertEquals(Week4.calculateBMI(80, 1.7), "Béo phì");
    }

    @Test
    public void testCalculateBMI4(){
        Assert.assertEquals(Week4.calculateBMI(70, 1.65), "Béo phì");
    }

    @Test
    public void testCalculateBMI5(){
        Assert.assertEquals(Week4.calculateBMI(50, 1.6), "Bình thường");
    }
}