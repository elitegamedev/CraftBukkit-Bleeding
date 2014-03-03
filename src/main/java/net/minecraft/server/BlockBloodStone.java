package net.minecraft.server;

public class BlockBloodStone extends Block {

    public BlockBloodStone() {
        super(Material.STONE);
        this.a(CreativeModeTab.b);
    }

    public MaterialMapColor f(int i) {
        return MaterialMapColor.K;
    }

    // CraftBukkit start
    public void doPhysics(World world, int i, int j, int k, int l) {
        if (net.minecraft.server.Block.e(l) != null && net.minecraft.server.Block.e(l).isPowerSource()) {
            int power = world.getWorld().getBlockAt(i, j, k).getBlockPower();

            org.bukkit.craftbukkit.event.CraftEventFactory.callRedstoneChange(world, i, j, k, power, power);
        }
    }
    // CraftBukkit end
}
