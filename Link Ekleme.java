try {
    Desktop.getDesktop().browse(new URL("https://google.com").toURI());
} catch (IOException e) {
    e.printStackTrace();
} catch (URISyntaxException e) {
    e.printStackTrace();
}
