package ru.akvine.dozor.view.dictionary;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;
import ru.akvine.dozor.entity.Dictionary;
import ru.akvine.dozor.view.main.MainView;


@Route(value = "dictionaries", layout = MainView.class)
@ViewController(id = "Dictionary.list")
@ViewDescriptor(path = "dictionary-list-view.xml")
@LookupComponent("dictionariesDataGrid")
@DialogMode(width = "64em")
public class DictionaryListView extends StandardListView<Dictionary> {
}