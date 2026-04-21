class EmailNotifier implements ShowObserver {
    private String emailAddress;

    public EmailNotifier(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public void update(Program.Day day, String action, Show show) {
        if ("CLEAR".equals(action)) {
            System.out.println(String.format(
                    "[Email] Sending to %s: All shows have been cleared",
                    emailAddress));
        } else if ("ADD".equals(action)) {
            System.out.println(String.format(
                    "[Email] Sending to %s: Show '%s' added on %s",
                    emailAddress, show.description(), day));
        } else if ("REMOVE".equals(action)) {
            System.out.println(String.format(
                    "[Email] Sending to %s: Show '%s' removed from %s",
                    emailAddress, show.description(), day));
        }
    }
}

