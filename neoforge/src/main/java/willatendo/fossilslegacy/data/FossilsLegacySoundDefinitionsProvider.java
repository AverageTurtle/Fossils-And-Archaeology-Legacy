package willatendo.fossilslegacy.data;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.common.data.SoundDefinition;
import net.neoforged.neoforge.common.data.SoundDefinitionsProvider;
import willatendo.fossilslegacy.server.sound.FossilsLegacySoundEvents;
import willatendo.fossilslegacy.server.utils.FossilsLegacyUtils;

public class FossilsLegacySoundDefinitionsProvider extends SoundDefinitionsProvider {
    public FossilsLegacySoundDefinitionsProvider(PackOutput packOutput, String modId, ExistingFileHelper existingFileHelper) {
        super(packOutput, modId, existingFileHelper);
    }

    @Override
    public void registerSounds() {
        this.add(FossilsLegacySoundEvents.BRACHIOSAURUS_AMBIENT.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "brachiosaurus.ambient").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("brachiosaurus_ambient_1"), SoundDefinition.SoundType.SOUND)).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("brachiosaurus_ambient_2"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.BRACHIOSAURUS_HURT.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "brachiosaurus.hurt").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("brachiosaurus_hurt_1"), SoundDefinition.SoundType.SOUND)).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("brachiosaurus_hurt_2"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.BRACHIOSAURUS_DEATH.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "brachiosaurus.death").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("brachiosaurus_death"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.CARNOTAURUS_AMBIENT.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "carnotaurus.ambient").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("carnotaurus_ambient_1"), SoundDefinition.SoundType.SOUND)).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("carnotaurus_ambient_2"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.CARNOTAURUS_HURT.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "carnotaurus.hurt").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("carnotaurus_hurt"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.CARNOTAURUS_DEATH.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "carnotaurus.death").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("carnotaurus_death"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.COMPSOGNATHUS_AMBIENT.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "compsognathus.ambient").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("compsognathus_ambient_1"), SoundDefinition.SoundType.SOUND)).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("compsognathus_ambient_2"), SoundDefinition.SoundType.SOUND)).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("compsognathus_ambient_3"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.COMPSOGNATHUS_HURT.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "compsognathus.hurt").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("compsognathus_hurt"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.COMPSOGNATHUS_DEATH.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "compsognathus.death").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("compsognathus_death_1"), SoundDefinition.SoundType.SOUND)).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("compsognathus_death_2"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.CRYOLOPHOSAURUS_AMBIENT.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "cryolophosaurus.ambient").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("cryolophosaurus_ambient_1"), SoundDefinition.SoundType.SOUND)).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("cryolophosaurus_ambient_2"), SoundDefinition.SoundType.SOUND)).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("cryolophosaurus_ambient_3"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.CRYOLOPHOSAURUS_HURT.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "cryolophosaurus.hurt").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("cryolophosaurus_hurt"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.CRYOLOPHOSAURUS_DEATH.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "cryolophosaurus.death").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("cryolophosaurus_death"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.DILOPHOSAURUS_AMBIENT.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "dilophosaurus.ambient").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("dilophosaurus_ambient"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.DILOPHOSAURUS_CALL.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "dilophosaurus.call").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("dilophosaurus_call_1"), SoundDefinition.SoundType.SOUND)).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("dilophosaurus_call_2"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.DILOPHOSAURUS_HURT.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "dilophosaurus.hurt").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("dilophosaurus_hurt"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.DILOPHOSAURUS_DEATH.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "dilophosaurus.death").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("dilophosaurus_death"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.MAMMOTH_AMBIENT.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "mammoth.ambient").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("mammoth_ambient"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.MAMMOTH_HURT.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "mammoth.hurt").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("mammoth_hurt"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.MAMMOTH_DEATH.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "mammoth.death").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("mammoth_death"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.FUTABASAURUS_AMBIENT.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "futabasaurus.ambient").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("futabasaurus_ambient"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.FUTABASAURUS_HURT.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "futabasaurus.hurt").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("futabasaurus_hurt"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.FUTABASAURUS_DEATH.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "futabasaurus.death").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("futabasaurus_death"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.PACHYCEPHALOSAURUS_AMBIENT.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "pachycephalosaurus.ambient").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("pachycephalosaurus_ambient_1"), SoundDefinition.SoundType.SOUND)).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("pachycephalosaurus_ambient_2"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.PACHYCEPHALOSAURUS_HURT.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "pachycephalosaurus.hurt").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("pachycephalosaurus_hurt_1"), SoundDefinition.SoundType.SOUND)).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("pachycephalosaurus_hurt_2"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.PACHYCEPHALOSAURUS_DEATH.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "pachycephalosaurus.death").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("pachycephalosaurus_death"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.PTERANODON_AMBIENT.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "pteranodon.ambient").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("pteranodon_ambient_1"), SoundDefinition.SoundType.SOUND)).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("pteranodon_ambient_2"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.PTERANODON_HURT.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "pteranodon.hurt").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("pteranodon_hurt"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.PTERANODON_DEATH.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "pteranodon.death").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("pteranodon_death"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.SMILODON_AMBIENT.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "smilodon.ambient").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("smilodon_ambient_1"), SoundDefinition.SoundType.SOUND)).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("smilodon_ambient_2"), SoundDefinition.SoundType.SOUND)).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("smilodon_ambient_3"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.SMILODON_HURT.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "smilodon.hurt").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("smilodon_hurt"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.SMILODON_DEATH.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "smilodon.death").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("smilodon_death"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.STEGOSAURUS_AMBIENT.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "stegosaurus.ambient").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("stegosaurus_ambient_1"), SoundDefinition.SoundType.SOUND)).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("stegosaurus_ambient_2"), SoundDefinition.SoundType.SOUND)).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("stegosaurus_ambient_3"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.STEGOSAURUS_HURT.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "stegosaurus.hurt").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("stegosaurus_hurt"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.STEGOSAURUS_DEATH.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "stegosaurus.death").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("stegosaurus_death"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.TRICERATOPS_AMBIENT.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "triceratops.ambient").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("triceratops_ambient_1"), SoundDefinition.SoundType.SOUND)).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("triceratops_ambient_2"), SoundDefinition.SoundType.SOUND)).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("triceratops_ambient_3"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.TRICERATOPS_HURT.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "triceratops.hurt").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("triceratops_hurt_1"), SoundDefinition.SoundType.SOUND)).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("triceratops_hurt_2"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.TRICERATOPS_DEATH.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "triceratops.death").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("triceratops_death"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.THERIZINOSAURUS_AMBIENT.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "therizinosaurus.ambient").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("therizinosaurus_ambient_1"), SoundDefinition.SoundType.SOUND)).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("therizinosaurus_ambient_2"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.THERIZINOSAURUS_HURT.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "therizinosaurus.hurt").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("therizinosaurus_hurt"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.THERIZINOSAURUS_DEATH.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "therizinosaurus.death").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("therizinosaurus_death"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.TYRANNOSAURUS_AMBIENT.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "tyrannosaurus.ambient").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("tyrannosaurus_ambient_1"), SoundDefinition.SoundType.SOUND)).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("tyrannosaurus_ambient_2"), SoundDefinition.SoundType.SOUND)).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("tyrannosaurus_ambient_3"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.TYRANNOSAURUS_ATTACK.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "tyrannosaurus.attack").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("tyrannosaurus_attack_1"), SoundDefinition.SoundType.SOUND)).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("tyrannosaurus_attack_2"), SoundDefinition.SoundType.SOUND)).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("tyrannosaurus_attack_3"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.TYRANNOSAURUS_HURT.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "tyrannosaurus.hurt").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("tyrannosaurus_hurt"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.TYRANNOSAURUS_DEATH.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "tyrannosaurus.death").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("tyrannosaurus_death"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.VELOCIRAPTOR_AMBIENT_TAME.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "velociraptor.ambient.tame").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("velociraptor_ambient_tame_1"), SoundDefinition.SoundType.SOUND)).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("velociraptor_ambient_tame_2"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.VELOCIRAPTOR_AMBIENT_WILD.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "velociraptor.ambient.wild").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("velociraptor_ambient_wild_1"), SoundDefinition.SoundType.SOUND)).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("velociraptor_ambient_wild_2"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.VELOCIRAPTOR_ATTACK.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "velociraptor.attack").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("velociraptor_attack_1"), SoundDefinition.SoundType.SOUND)).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("velociraptor_attack_2"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.VELOCIRAPTOR_HURT.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "velociraptor.hurt").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("velociraptor_hurt_1"), SoundDefinition.SoundType.SOUND)).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("velociraptor_hurt_2"), SoundDefinition.SoundType.SOUND)).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("velociraptor_hurt_3"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.VELOCIRAPTOR_DEATH.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "velociraptor.death").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("velociraptor_death"), SoundDefinition.SoundType.SOUND)));

        this.add(FossilsLegacySoundEvents.DRUM_HIT.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "drum.hit").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("drum_hit"), SoundDefinition.SoundType.SOUND)));
        this.add(FossilsLegacySoundEvents.DRUM_TRIPLE_HIT.get(), SoundDefinition.definition().subtitle(FossilsLegacyUtils.translation("sound", "drum.triple_hit").getString()).with(SoundDefinition.Sound.sound(FossilsLegacyUtils.resource("drum_triple_hit"), SoundDefinition.SoundType.SOUND)));
    }

    @Override
    public String getName() {
        return "fossilslegacy: Sound Defs";
    }
}
