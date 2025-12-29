package ru.akvine.dozor.view.plan;

import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;
import ru.akvine.dozor.entity.Plan;
import ru.akvine.dozor.view.main.MainView;


@Route(value = "plans", layout = MainView.class)
@ViewController(id = "Plan_.list")
@ViewDescriptor(path = "plan-list-view.xml")
@LookupComponent("plansDataGrid")
@DialogMode(width = "64em")
public class PlanListView extends StandardListView<Plan> {
}