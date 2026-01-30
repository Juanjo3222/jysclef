package adris.altoclef.multiversion.versionedfields;

import net.minecraft.entity.Entity;

/**
 * A helper class implementing entities that are not yet supported in certain versions
 */
public class Entities {

    public static final Class<? extends Entity> UNSUPPORTED;
    public static final Class<? extends Entity> WARDEN;
    public static final Class<? extends Entity> GLOW_SQUID;
    public static final Class<? extends Entity> BREEZE;
    public static final Class<? extends Entity> BOGGED;

    static {
        UNSUPPORTED = VersionedFieldHelper.getUnsupportedEntityClass();

        //#if MC >= 11904
        WARDEN = net.minecraft.entity.mob.WardenEntity.class;
        //#else
        //$$ WARDEN = UNSUPPORTED;
        //#endif

        //#if MC >= 11701
        GLOW_SQUID = net.minecraft.entity.passive.GlowSquidEntity.class;
        //#else
        //$$ GLOW_SQUID = UNSUPPORTED;
        //#endif

        //#if MC >= 12100
        BREEZE = net.minecraft.entity.mob.BreezeEntity.class;
        BOGGED = net.minecraft.entity.mob.BoggedEntity.class;
        //#else
        //$$ BREEZE = UNSUPPORTED;
        //$$ BOGGED = UNSUPPORTED;
        //#endif
    }



}
