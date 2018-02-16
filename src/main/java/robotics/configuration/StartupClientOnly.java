package robotics.configuration;

/**
 * The Startup classes for this example are called during startup, in the following order:
 *  preInitCommon
 *  preInitClientOnly
 *  initCommon
 *  initClientOnly
 *  postInitCommon
 *  postInitClientOnly
 *  See Robotics class for more information
 */

public class StartupClientOnly
{
    public static void preInitClientOnly()
    {
        RoboticsConfiguration.clientPreInit();  // used to set up an event handler for the GUI so that the altered values are
        //  saved back to disk.
    }

    public static void initClientOnly()
    {
    }

    public static void postInitClientOnly()
    {
    }

}
