package com.pg85.otg.util.interfaces;

import java.util.ArrayList;
import java.util.List;

import com.pg85.otg.constants.SettingsEnums.BiomeMode;
import com.pg85.otg.constants.SettingsEnums.ConfigMode;
import com.pg85.otg.constants.SettingsEnums.ImageMode;
import com.pg85.otg.constants.SettingsEnums.ImageOrientation;
import com.pg85.otg.util.biome.ReplacedBlocksMatrix;
import com.pg85.otg.util.materials.LocalMaterialData;

public interface IWorldConfig
{
	public ConfigMode getSettingsMode();
	
	// Biome resources

	public long getResourcesSeed();
	public boolean isDisableOreGen();
	public boolean getBedrockDisabled();
	
	// Blocks

	public boolean getRemoveSurfaceStone();
	public LocalMaterialData getWaterBlock();
	public LocalMaterialData getBedrockBlockReplaced(ReplacedBlocksMatrix replacedBlocks, int y);
	public LocalMaterialData getDefaultBedrockBlock();
	public LocalMaterialData getCooledLavaBlock();
	public LocalMaterialData getIceBlock();
	
	// Bedrock
	
	public boolean getIsCeilingBedrock();
	public boolean getIsFlatBedrock();
	
	// Biome settings

	public ArrayList<String> getWorldBiomes();
	public int getBiomeRarityScale();
	public int getGenerationDepth();
	public int getLandFuzzy();
	public int getLandRarity();
	public int getLandSize();
	public String getDefaultOceanBiome();
	public BiomeMode getBiomeMode();
	double getFrozenOceanTemperature();
	public boolean getIsFreezeGroups();
	public List<String> getIsleBiomes();
	public List<String> getBorderBiomes();
	public boolean getIsRandomRivers();
	public int getRiverRarity();
	public int getRiverSize();
	public boolean getRiversEnabled();
	public boolean getBiomeConfigsHaveReplacement();
	public boolean setBiomeConfigsHaveReplacement(boolean biomeConfigsHaveReplacement);
	
	// Terrain settings
	
	public double getFractureHorizontal();
	public double getFractureVertical();
	public int getWorldHeightCap();	
	public int getWorldHeightScale();
	public void setMaxSmoothRadius(int smoothRadius);
	public int getMaxSmoothRadius();
	public boolean isBetterSnowFall();
	public boolean isFullyFreezeLakes();
	public int getWaterLevelMax();
	public int getWaterLevelMin();
	
	// FromImageMode

	public ImageOrientation getImageOrientation();
	public String getImageFile();
	public String getImageFillBiome();
	public ImageMode getImageMode();
	public int getImageZOffset();
	public int getImageXOffset();
	
	// Vanilla structures

	public boolean getWoodlandMansionsEnabled();
	public boolean getNetherFortressesEnabled();
	public boolean getBuriedTreasureEnabled();
	public boolean getOceanRuinsEnabled();
	public boolean getPillagerOutpostsEnabled();
	public boolean getBastionRemnantsEnabled();
	public boolean getNetherFossilsEnabled();
	public boolean getEndCitiesEnabled();
	public boolean getRuinedPortalsEnabled();
	public boolean getShipWrecksEnabled();
	public boolean getStrongholdsEnabled();
	public boolean getVillagesEnabled();	
	public boolean getMineshaftsEnabled();
	public boolean getOceanMonumentsEnabled();
	public boolean getRareBuildingsEnabled();
	
	// OTG Custom structures

	public boolean isOTGPlus();
	public boolean doPopulationBoundsCheck();
	public int getMaximumCustomStructureRadius();
	
	// Caves & Ravines
	
	public int getRavineRarity();
	public int getRavineMinLength();
	public int getRavineMaxLength();
	public double getRavineDepth();
	public int getRavineMinAltitude();
	public int getRavineMaxAltitude();
	public int getCaveFrequency();
	public int getCaveRarity();
	public boolean isEvenCaveDistribution();
	public int getCaveMinAltitude();
	public int getCaveMaxAltitude();
	public int getCaveSystemFrequency();
	public int getIndividualCaveRarity();
	public int getCaveSystemPocketMinSize();
	public int getCaveSystemPocketChance();
	public int getCaveSystemPocketMaxSize();	
}
