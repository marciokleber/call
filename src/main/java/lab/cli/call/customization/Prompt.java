package lab.cli.call.customization;

import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.stereotype.Component;

@Component
public class Prompt implements PromptProvider {
    @Override
    public AttributedString getPrompt() {
        return new AttributedString("CALL:> ",
                AttributedStyle.DEFAULT.foreground(AttributedStyle.BLUE)
        );
    }
}
