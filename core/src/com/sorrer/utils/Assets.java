package com.sorrer.utils;

import com.badlogic.gdx.assets.AssetDescriptor;
import com.badlogic.gdx.assets.AssetManager;
import com.badlogic.gdx.graphics.Texture;

public class Assets {
	public static final AssetManager manager = new AssetManager();
//	public static final AssetDescriptor<FreeTypeFontGenerator> dialog = new AssetDescriptor<FreeTypeFontGenerator>("Roboto-Regular.ttf", FreeTypeFontGenerator.class);
//	
//	public static final AssetDescriptor<Texture> fire_stick = new AssetDescriptor<Texture>("fire_stick.png", Texture.class);
//	public static final AssetDescriptor<Texture> fire_stick_burntout = new AssetDescriptor<Texture>("fire_stick_burntout.png", Texture.class);
//
//	public static final AssetDescriptor<Texture> camp_fire = new AssetDescriptor<Texture>("camp_fire.png", Texture.class);
//	public static final AssetDescriptor<Texture> camp_fire_burntout = new AssetDescriptor<Texture>("camp_fire_burntout.png", Texture.class);
//
//	public static final AssetDescriptor<Texture> fire_pit_full = new AssetDescriptor<Texture>("fire_pit_full.png", Texture.class);
//	public static final AssetDescriptor<Texture> fire_pit_empty = new AssetDescriptor<Texture>("fire_pit_empty.png", Texture.class);
//
//	public static final AssetDescriptor<Texture> worker = new AssetDescriptor<Texture>("worker.png", Texture.class);
//	public static final AssetDescriptor<Texture> stockpile = new AssetDescriptor<Texture>("stockpile.png", Texture.class);
//	
//	public static final AssetDescriptor<Texture> tree = new AssetDescriptor<Texture>("tree.png", Texture.class);
//	
//	public static final AssetDescriptor<Texture> icon_wood = new AssetDescriptor<Texture>("wood_icon.png", Texture.class);
//	
//	public static final ParticleEffect fire_particle = new ParticleEffect();
//	

	public static final AssetDescriptor<Texture> strong = new AssetDescriptor<Texture>("strong.png", Texture.class);
	public static final AssetDescriptor<Texture> human = new AssetDescriptor<Texture>("human.png", Texture.class);
	public static final AssetDescriptor<Texture> background = new AssetDescriptor<Texture>("background.png", Texture.class);
	
	public static void load(){
		PrintLog.printGame("Loading Files");
//		fire_particle.load(Gdx.files.internal("fire.particle"), Gdx.files.internal(""));
//		manager.load(fire_pit_empty);
//		manager.load(fire_pit_full);
//
//		manager.load(camp_fire);
//		manager.load(camp_fire_burntout);
//		
//		manager.load(fire_stick);
//		manager.load(fire_stick_burntout);
//		
//		manager.load(stockpile);
//		manager.load(worker);
//		
//		manager.load(tree);
//		
//		manager.load(icon_wood);
//		
//		manager.setLoader(FreeTypeFontGenerator.class, new FreeTypeFontGeneratorLoader(new InternalFileHandleResolver()));
//		manager.load(dialog);

		manager.load(strong);
		manager.load(human);
		manager.load(background);
	}
	
	public static void dipose(){
		
	}
}
