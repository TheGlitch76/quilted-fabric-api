/*
 * Copyright 2016, 2017, 2018, 2019 FabricMC
 * Copyright 2022-2023 QuiltMC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.fabricmc.fabric.api.biome.v1;

import net.minecraft.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;

/**
 * API that exposes the internals of Minecraft's nether biome code.
 *
 * <p><b>Experimental feature</b>, may be removed or changed without further notice.
 *
 * @deprecated Use Quilt Biome API's {@link org.quiltmc.qsl.worldgen.biome.api.NetherBiomes} instead.
 */
@Deprecated
public final class NetherBiomes {
	private NetherBiomes() {
	}

	/**
	 * Adds a biome to the Nether generator.
	 *
	 * @param biome           The biome to add. Must not be null.
	 * @param mixedNoisePoint data about the given {@link Biome}'s spawning information in the nether.
	 * @see MultiNoiseUtil.NoiseValuePoint
	 */
	public static void addNetherBiome(RegistryKey<Biome> biome, MultiNoiseUtil.NoiseValuePoint mixedNoisePoint) {
		org.quiltmc.qsl.worldgen.biome.api.NetherBiomes.addNetherBiome(biome, mixedNoisePoint);
	}

	/**
	 * Adds a biome to the Nether generator.
	 *
	 * @param biome           The biome to add. Must not be null.
	 * @param mixedNoisePoint data about the given {@link Biome}'s spawning information in the nether.
	 * @see MultiNoiseUtil.NoiseHypercube
	 */
	public static void addNetherBiome(RegistryKey<Biome> biome, MultiNoiseUtil.NoiseHypercube mixedNoisePoint) {
		org.quiltmc.qsl.worldgen.biome.api.NetherBiomes.addNetherBiome(biome, mixedNoisePoint);
	}

	/**
	 * Returns true if the given biome can generate in the nether, considering the Vanilla nether biomes,
	 * and any biomes added to the Nether by mods.
	 */
	public static boolean canGenerateInNether(RegistryKey<Biome> biome) {
		return org.quiltmc.qsl.worldgen.biome.api.NetherBiomes.canGenerateInNether(biome);
	}
}
