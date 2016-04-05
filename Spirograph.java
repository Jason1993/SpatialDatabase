/**
 * Created by wenqingcao1 on 4/4/16.
 */
import java.lang.Math;
import java.io.*;
import java.util.*;
public class Spirograph {
    public static void main(String args[]) throws IOException
    {
        PrintWriter out = null;
        double R = 5, r = 1, a = 4, nRev = 10;
        double y0 = 34.02097840429;
        double x0 = -118.28863756512872;
        double i,pi = Math.PI;
        try {
             out = new PrintWriter("test.kml");
            for (i = 0.0; i < (pi * nRev); i += 0.01) {
                double x = (R+r)*Math.cos((r/R)*i) - a*Math.cos((1+r/R)*i);
                double y = (R+r)*Math.sin((r/R)*i) - a*Math.sin((1+r/R)*i);
                double finalx = x+x0;
                double finaly = y+y0;
                out.println(finalx+","+finaly);
                }
            out.close();
            }catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

