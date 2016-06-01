package reborncore.mcmultipart.client.multipart;

import reborncore.mcmultipart.multipart.IMultipart;
import reborncore.mcmultipart.raytrace.PartMOP;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public interface ICustomHighlightPart extends IMultipart {

    @SideOnly(Side.CLIENT)
    public boolean drawHighlight(PartMOP hit, EntityPlayer player, float partialTicks);

}
