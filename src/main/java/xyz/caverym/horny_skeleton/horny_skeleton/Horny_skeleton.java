package xyz.caverym.horny_skeleton.horny_skeleton;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Horny_skeleton implements ModInitializer {
    public static final Identifier TRUMPET_SOUND = new Identifier("horny_skeleton:trumpet_sound");
    public static SoundEvent TRUMPET_SOUND_EVENT = new SoundEvent(TRUMPET_SOUND);
    public static TrumpetItem TRUMPET_ITEM = new TrumpetItem(new FabricItemSettings().group(ItemGroup.TOOLS).maxCount(1));
    public static final EntityType<HornySkeleton> HORNY_SKELETON = Registry.register(
            Registry.ENTITY_TYPE,
            new Identifier("horny_skeleton", "hornyskeleton"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, HornySkeleton::new).build()
    );

    @Override
    public void onInitialize() {
        Registry.register(Registry.SOUND_EVENT, Horny_skeleton.TRUMPET_SOUND, Horny_skeleton.TRUMPET_SOUND_EVENT);
        Registry.register(Registry.ITEM, "trumpet", Horny_skeleton.TRUMPET_ITEM);
        FabricDefaultAttributeRegistry.register(HORNY_SKELETON, HornySkeleton.createMobAttributes());
    }
}
