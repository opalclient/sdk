import wtf.opal.sdk.Opal;
import wtf.opal.sdk.event.impl.InGameHudRenderEvent;
import wtf.opal.sdk.module.Module;
import wtf.opal.sdk.module.ModuleData;
import wtf.opal.sdk.module.property.impl.NumberProperty;

// Default category is "Misc"
@ModuleData(name = "test", description = "test")
public class Test extends Module {

    private final NumberProperty myNumber = new NumberProperty("test", 5, 0, 100, 1);


    @Override
    public void init() {
        addProperties(myNumber);
    }

    @Override
    public void onInGameHudRenderEvent(InGameHudRenderEvent event) {
        //TODO: Find way to suppress null warnings
        Opal.getFontRenderer().drawString(event.drawContext(), "Hello World!", 10, 10, 10, 0xFFFFFFFF);
    }
}
