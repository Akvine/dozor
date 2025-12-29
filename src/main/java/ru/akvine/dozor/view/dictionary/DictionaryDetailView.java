package ru.akvine.dozor.view.dictionary;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import ru.akvine.dozor.entity.Dictionary;
import ru.akvine.dozor.view.main.MainView;

@Route(value = "dictionaries/:id", layout = MainView.class)
@ViewController(id = "Dictionary.detail")
@ViewDescriptor(path = "dictionary-detail-view.xml")
@EditedEntityContainer("dictionaryDc")
public class DictionaryDetailView extends StandardDetailView<Dictionary> {
}