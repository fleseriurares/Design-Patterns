package adapter;

import adapter.round.RoundHole;
import adapter.round.RoundPeg;
import adapter.square.SquarePeg;
import adapter.adapters.SquarePegAdapter;

public class Demo {
    public static void main(String[] args)
    {
        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(6);

        if(hole.fits(rpeg))
        {
            System.out.println("Roundpeg r5 fits round hole r6");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if(hole.fits(smallSqPegAdapter))
        {
            System.out.println("Sqare peg w2 firts hole r5");
        }
        if(!hole.fits(largeSqPegAdapter))
        {
            System.out.println("Square peg w20 doesn't fit into round hole r5");
        }
    }
}