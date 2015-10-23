package ch.comgr.particleswarm.controller;

import ch.fhnw.ether.formats.obj.OBJReader;
import ch.fhnw.ether.scene.mesh.IMesh;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Roger on 23.10.2015.
 */
public class ObjectLoader {
    public List<IMesh> getMeshesFromObject(String path) {
        try {
            return new OBJReader(getClass().getResource(path)).getMeshes();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}
