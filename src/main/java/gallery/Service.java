package gallery;

import act.cli.Command;
import act.cli.Optional;
import act.inject.DefaultValue;
import org.osgl.mvc.annotation.GetAction;

public class Service {

    @GetAction("/calcPi")
    @Command(name = "calcPi", help = "calculate pi")
    public double calcPi(@DefaultValue("99999999") @Optional int steps) {
        double pi = 0.0d;
        for (int i = steps; i > 0; --i) {
            pi += Math.pow(-1, i + 1) / (2 * i - 1);
            if (i == 1) {
                pi *= 4;
                break;
            }
        }
        return pi;
    }

}
