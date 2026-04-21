// TODO: Implement LoggerNotifier (logs to console)
class LoggerNotifier implements ShowObserver {
    private final String loggerName;

    public LoggerNotifier(String loggerName) {
        this.loggerName = loggerName;
    }


    @Override
    public void update(Program.Day day, String action, Show show) {
        String timestamp = java.time.LocalTime.now().toString();
        if ("CLEAR".equals(action)) {
            System.out.println(String.format(
                    "[LOG][%s] %s: Program cleared at %s",
                    loggerName, timestamp, timestamp));
        } else if ("ADD".equals(action)) {
            System.out.println(String.format(
                    "[LOG][%s] %s: Show added - Day: %s, Show: %s, Time: %d min",
                    loggerName, timestamp, day, show.title(), show.time()));
        } else if ("REMOVE".equals(action)) {
            System.out.println(String.format(
                    "[LOG][%s] %s: Show removed - Day: %s",
                    loggerName, timestamp, day));
        }
    }
}
