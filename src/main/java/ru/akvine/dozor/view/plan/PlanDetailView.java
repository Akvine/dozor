package ru.akvine.dozor.view.plan;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.EditedEntityContainer;
import io.jmix.flowui.view.StandardDetailView;
import io.jmix.flowui.view.ViewController;
import io.jmix.flowui.view.ViewDescriptor;
import ru.akvine.dozor.entity.Plan;
import ru.akvine.dozor.view.main.MainView;

@Route(value = "plans/:id", layout = MainView.class)
@ViewController(id = "Plan_.detail")
@ViewDescriptor(path = "plan-detail-view.xml")
@EditedEntityContainer("planDc")
public class PlanDetailView extends StandardDetailView<Plan> {
}