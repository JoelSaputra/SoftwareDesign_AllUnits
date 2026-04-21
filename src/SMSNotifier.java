// TODO: Implement SMSNotifier (sends text message)
class SMSNotifier implements ShowObserver {
    private String phoneNumber;

    public SMSNotifier(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public void update(Program.Day day, String action, Show show) {
        if ("CLEAR".equals(action)) {
            System.out.println(String.format(
                    "[SMS] Sending to %s: Program cleared",
                    phoneNumber));
        } else if ("ADD".equals(action)) {
            System.out.println(String.format(
                    "[SMS] Sending to %s: %s added on %s - %d min",
                    phoneNumber, show.title(), day, show.time()));
        } else if ("REMOVE".equals(action)) {
            System.out.println(String.format(
                    "[SMS] Sending to %s: Show removed from %s",
                    phoneNumber, day));
        }
    }
}