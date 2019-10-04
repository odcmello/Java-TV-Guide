package View.Resources;

import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import javax.swing.text.JTextComponent;

public class SugestaoImplementation implements ClienteSugestao<JTextComponent> {

    private Function<String, List<String>> suggestionProvider;

    public SugestaoImplementation(Function<String, List<String>> suggestionProvider) {
        this.suggestionProvider = suggestionProvider;
    }

    @Override
    public Point getPopupLocation(JTextComponent invoker) {
        return new Point(0, invoker.getPreferredSize().height);
    }

    @Override
    public void setSelectedText(JTextComponent invoker, String selectedValue) {
        invoker.setText(selectedValue);
    }

    @Override
    public List<String> getSuggestions(JTextComponent invoker) {
        return suggestionProvider.apply(invoker.getText().trim());
    }
}
