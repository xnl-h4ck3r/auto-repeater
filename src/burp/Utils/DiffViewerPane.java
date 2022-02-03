package burp.Utils;

import javax.swing.*;

public class DiffViewerPane extends JEditorPane {

  public DiffViewerPane(byte[] original, byte[] modified) {
    this.setEditable(false);
    this.setContentType("text/html");
    this.putClientProperty("html.disable", null);
  }

  public DiffViewerPane() {
    this.setEditable(false);
    this.setContentType("text/html");
    this.putClientProperty("html.disable", null);
  }


}
