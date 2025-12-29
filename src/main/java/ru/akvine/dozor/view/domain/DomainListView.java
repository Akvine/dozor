package ru.akvine.dozor.view.domain;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;
import ru.akvine.dozor.entity.Domain;
import ru.akvine.dozor.view.main.MainView;


@Route(value = "domains", layout = MainView.class)
@ViewController(id = "Domain.list")
@ViewDescriptor(path = "domain-list-view.xml")
@LookupComponent("domainsDataGrid")
@DialogMode(width = "64em")
public class DomainListView extends StandardListView<Domain> {
}