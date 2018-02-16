package robotics.configuration;

/**
 * User: TW
 * Date: 2/4/2015
 *
 * The Startup classes for this example are called during startup, in the following order:
 *  preInitCommon
 *  preInitClientOnly
 *  initCommon
 *  initClientOnly
 *  postInitCommon
 *  postInitClientOnly
 *  See Robotics class for more information
 */
public class StartupCommon
{
    public static void preInitCommon()
    {
        RoboticsConfiguration.preInit();
        System.out.println("MBE70: myInteger=" + RoboticsConfiguration.myInteger
                + "; myBoolean=" + RoboticsConfiguration.myBoolean
                + "; myString=" + RoboticsConfiguration.myString);
        System.out.println("MBE70: myDouble=" + RoboticsConfiguration.myDouble
                + "; myColour=" + RoboticsConfiguration.myColour);
        System.out.print("MBE70: myIntList=");
        for (int value : RoboticsConfiguration.myIntList) {
            System.out.print(value + "; ");
        }
        System.out.println();

    }

    public static void initCommon()
    {
    }

    public static void postInitCommon()
    {
    }

}
