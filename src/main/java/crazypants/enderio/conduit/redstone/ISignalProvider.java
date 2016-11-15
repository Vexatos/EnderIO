package crazypants.enderio.conduit.redstone;

import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import java.util.Set;

public interface ISignalProvider {

	Set<Signal> getNetworkInputs(World world, BlockPos pos, EnumFacing side);

}
