package adris.altoclef.multiversion.versionedfields;

import net.minecraft.block.Block;

/**
 * A helper class implementing blocks that are not yet supported in certain versions
 * Using these in non-supported versions might lead to strange bugs and/or crashes...
 * Please see {@link VersionedFieldHelper#isSupported(Object)}
 */
public abstract class Blocks extends net.minecraft.block.Blocks {

    public static final Block UNSUPPORTED = VersionedFieldHelper.createUnsafeUnsupportedBlock();

    //#if MC <= 11802
    //$$ public static final Block MANGROVE_PROPAGULE = UNSUPPORTED;
    //$$ public static final Block CHERRY_LEAVES = UNSUPPORTED;
    //$$ public static final Block MANGROVE_SIGN = UNSUPPORTED;
    //$$ public static final Block MANGROVE_WALL_SIGN = UNSUPPORTED;
    //$$ public static final Block BAMBOO_SIGN = UNSUPPORTED;
    //$$ public static final Block BAMBOO_WALL_SIGN = UNSUPPORTED;
    //$$ public static final Block CHERRY_SIGN = UNSUPPORTED;
    //$$ public static final Block CHERRY_WALL_SIGN = UNSUPPORTED;
    //$$ public static final Block SCULK = UNSUPPORTED;
    //$$ public static final Block SCULK_VEIN = UNSUPPORTED;
    //$$ public static final Block SCULK_SHRIEKER = UNSUPPORTED;
    //#endif

    //#if MC <= 11605
    //$$ public static Block FLOWERING_AZALEA = UNSUPPORTED;
    //$$ public static Block AZALEA = UNSUPPORTED;
    //$$ public static Block POWDER_SNOW = UNSUPPORTED;
    //$$ public static Block BIG_DRIPLEAF = UNSUPPORTED;
    //$$ public static Block BIG_DRIPLEAF_STEM = UNSUPPORTED;
    //$$ public static Block CAVE_VINES_PLANT = UNSUPPORTED;
    //$$ public static Block CAVE_VINES = UNSUPPORTED;
    //$$ public static Block SMALL_AMETHYST_BUD = UNSUPPORTED;
    //$$ public static Block MEDIUM_AMETHYST_BUD = UNSUPPORTED;
    //$$ public static Block LARGE_AMETHYST_BUD = UNSUPPORTED;
    //$$ public static Block AMETHYST_CLUSTER = UNSUPPORTED;
    //$$ public static Block CALCITE = UNSUPPORTED;
    //$$ public static Block TUFF = UNSUPPORTED;
    //$$ public static Block DEEPSLATE_COAL_ORE = UNSUPPORTED;
    //$$ public static Block DEEPSLATE_IRON_ORE = UNSUPPORTED;
    //$$ public static Block DEEPSLATE_GOLD_ORE = UNSUPPORTED;
    //$$ public static Block DEEPSLATE_COPPER_ORE = UNSUPPORTED;
    //$$ public static Block DEEPSLATE_DIAMOND_ORE = UNSUPPORTED;
    //$$ public static Block DEEPSLATE_EMERALD_ORE = UNSUPPORTED;
    //$$ public static Block DEEPSLATE_REDSTONE_ORE = UNSUPPORTED;
    //$$ public static Block DEEPSLATE_LAPIS_ORE = UNSUPPORTED;
    //$$ public static Block POINTED_DRIPSTONE = UNSUPPORTED;
    //$$ public static Block SMALL_DRIPLEAF = UNSUPPORTED;
    //$$ public static Block COPPER_ORE = UNSUPPORTED;
    //$$ public static Block GLOW_LICHEN = UNSUPPORTED;
    //$$ public static Block DEEPSLATE_BRICKS = UNSUPPORTED;
    //$$ public static Block SCULK_SENSOR = UNSUPPORTED;
    //$$ public static Block DEEPSLATE_TILE_STAIRS = UNSUPPORTED;
    //$$ public static Block CRACKED_DEEPSLATE_BRICKS = UNSUPPORTED;
    //$$ public static Block DEEPSLATE_TILES = UNSUPPORTED;
    //$$ public static Block POLISHED_DEEPSLATE = UNSUPPORTED;
    //$$ public static Block AMETHYST_BLOCK = UNSUPPORTED;
    //$$ public static Block BUDDING_AMETHYST = UNSUPPORTED;
    //$$ public static Block DEEPSLATE = UNSUPPORTED;
    //$$ public static Block COBBLED_DEEPSLATE = UNSUPPORTED;
    //$$ public static Block DRIPSTONE_BLOCK = UNSUPPORTED;
    //#endif

    //#if MC <= 12006
    //$$ public static Block TRIAL_SPAWNER = UNSUPPORTED;
    //$$ public static Block OMINOUS_TRIAL_SPAWNER = UNSUPPORTED;
    //$$ public static Block VAULT = UNSUPPORTED;
    //$$ public static Block OMINOUS_VAULT = UNSUPPORTED;
    //$$ public static Block CHISELED_TUFF = UNSUPPORTED;
    //$$ public static Block CHISELED_TUFF_BRICKS = UNSUPPORTED;
    //$$ public static Block TUFF_SLAB = UNSUPPORTED;
    //$$ public static Block TUFF_STAIRS = UNSUPPORTED;
    //$$ public static Block TUFF_WALL = UNSUPPORTED;
    //$$ public static Block TUFF_BRICKS = UNSUPPORTED;
    //$$ public static Block TUFF_BRICK_SLAB = UNSUPPORTED;
    //$$ public static Block TUFF_BRICK_STAIRS = UNSUPPORTED;
    //$$ public static Block TUFF_BRICK_WALL = UNSUPPORTED;
    //$$ public static Block POLISHED_TUFF = UNSUPPORTED;
    //$$ public static Block POLISHED_TUFF_SLAB = UNSUPPORTED;
    //$$ public static Block POLISHED_TUFF_STAIRS = UNSUPPORTED;
    //$$ public static Block POLISHED_TUFF_WALL = UNSUPPORTED;
    //$$ public static Block COPPER_BULB = UNSUPPORTED;
    //$$ public static Block EXPOSED_COPPER_BULB = UNSUPPORTED;
    //$$ public static Block WEATHERED_COPPER_BULB = UNSUPPORTED;
    //$$ public static Block OXIDIZED_COPPER_BULB = UNSUPPORTED;
    //$$ public static Block WAXED_COPPER_BULB = UNSUPPORTED;
    //$$ public static Block WAXED_EXPOSED_COPPER_BULB = UNSUPPORTED;
    //$$ public static Block WAXED_WEATHERED_COPPER_BULB = UNSUPPORTED;
    //$$ public static Block WAXED_OXIDIZED_COPPER_BULB = UNSUPPORTED;
    //$$ public static Block COPPER_GRATE = UNSUPPORTED;
    //$$ public static Block EXPOSED_COPPER_GRATE = UNSUPPORTED;
    //$$ public static Block WEATHERED_COPPER_GRATE = UNSUPPORTED;
    //$$ public static Block OXIDIZED_COPPER_GRATE = UNSUPPORTED;
    //$$ public static Block WAXED_COPPER_GRATE = UNSUPPORTED;
    //$$ public static Block WAXED_EXPOSED_COPPER_GRATE = UNSUPPORTED;
    //$$ public static Block WAXED_WEATHERED_COPPER_GRATE = UNSUPPORTED;
    //$$ public static Block WAXED_OXIDIZED_COPPER_GRATE = UNSUPPORTED;
    //$$ public static Block COPPER_DOOR = UNSUPPORTED;
    //$$ public static Block EXPOSED_COPPER_DOOR = UNSUPPORTED;
    //$$ public static Block WEATHERED_COPPER_DOOR = UNSUPPORTED;
    //$$ public static Block OXIDIZED_COPPER_DOOR = UNSUPPORTED;
    //$$ public static Block WAXED_COPPER_DOOR = UNSUPPORTED;
    //$$ public static Block WAXED_EXPOSED_COPPER_DOOR = UNSUPPORTED;
    //$$ public static Block WAXED_WEATHERED_COPPER_DOOR = UNSUPPORTED;
    //$$ public static Block WAXED_OXIDIZED_COPPER_DOOR = UNSUPPORTED;
    //$$ public static Block COPPER_TRAPDOOR = UNSUPPORTED;
    //$$ public static Block EXPOSED_COPPER_TRAPDOOR = UNSUPPORTED;
    //$$ public static Block WEATHERED_COPPER_TRAPDOOR = UNSUPPORTED;
    //$$ public static Block OXIDIZED_COPPER_TRAPDOOR = UNSUPPORTED;
    //$$ public static Block WAXED_COPPER_TRAPDOOR = UNSUPPORTED;
    //$$ public static Block WAXED_EXPOSED_COPPER_TRAPDOOR = UNSUPPORTED;
    //$$ public static Block WAXED_WEATHERED_COPPER_TRAPDOOR = UNSUPPORTED;
    //$$ public static Block WAXED_OXIDIZED_COPPER_TRAPDOOR = UNSUPPORTED;
    //#endif

}
