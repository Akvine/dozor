package ru.akvine.dozor.view.domain;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import ru.akvine.dozor.entity.Domain;
import ru.akvine.dozor.view.main.MainView;

@Route(value = "domains/:id", layout = MainView.class)
@ViewController(id = "Domain.detail")
@ViewDescriptor(path = "domain-detail-view.xml")
@EditedEntityContainer("domainDc")
public class DomainDetailView extends StandardDetailView<Domain> {
}