package interview_practice.design_pattern.servicelocator;

import interview_practice.design_pattern.servicelocator.assets.Audio;
import interview_practice.design_pattern.servicelocator.assets.Model;
import interview_practice.design_pattern.servicelocator.assets.Shader;
import interview_practice.design_pattern.servicelocator.assets.Texture;
import interview_practice.design_pattern.servicelocator.manager.AudioManager;
import interview_practice.design_pattern.servicelocator.manager.ModelManager;
import interview_practice.design_pattern.servicelocator.manager.ResourceManager;
import interview_practice.design_pattern.servicelocator.manager.ShaderManager;
import interview_practice.design_pattern.servicelocator.manager.TextureManager;

public class Client {

	public static void main(String[] args) {
        
        ServiceLocator.register(ResourceManager.class, new TextureManager());
        ServiceLocator.register(ResourceManager.class, new ModelManager());
        ServiceLocator.register(ResourceManager.class, new AudioManager());
        ServiceLocator.register(ResourceManager.class, new ShaderManager());

        // Request resources using the service locator
        ResourceManager<Texture> textureManager = ServiceLocator.get(ResourceManager.class);
        ResourceManager<Model> modelManager = ServiceLocator.get(ResourceManager.class);
        ResourceManager<Audio> audioManager = ServiceLocator.get(ResourceManager.class);
        ResourceManager<Shader> shaderManager = ServiceLocator.get(ResourceManager.class);

        // Load resources
        Texture texture = textureManager.load("textures/texture.png");
//        Model model = modelManager.load("models/model.obj");
//        Audio audio = audioManager.load("audio/sound.wav");
//        Shader shader = shaderManager.load("shaders/vertex.glsl");

        // Use the loaded resources
        if (texture != null) {
            System.out.println("Texture loaded successfully: " + texture);
        }
//        if (model != null) {
//            System.out.println("Model loaded successfully: " + model);
//        }
//        if (audio != null) {
//            System.out.println("Audio clip loaded successfully: " + audio);
//        }
//        if (shader != null) {
//            System.out.println("Shader compiled successfully: " + shader);
//        }
    }

}
