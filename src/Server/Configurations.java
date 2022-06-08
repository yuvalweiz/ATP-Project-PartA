package Server;
import algorithms.mazeGenerators.AMazeGenerator;
import algorithms.mazeGenerators.IMazeGenerator;
import algorithms.mazeGenerators.MyMazeGenerator;
import algorithms.mazeGenerators.SimpleMazeGenerator;
import algorithms.mazeGenerators.EmptyMazeGenerator;
import algorithms.search.*;

import java.io.*;
import java.util.Objects;
import java.util.Properties;



    public class Configurations {
        private static Configurations MYinstance =  null;
        private static Properties prop= new Properties();
        InputStream input;
        //private static final String SOLVER_ALGORITHM = "Solver Algorithm";
        //private static final String MAZE_GENERATOR = "Maze Generator";

        private Configurations() {
            try{

                InputStream input = Configurations.class.getResourceAsStream("/config.properties");
                prop.load(input);
            }
            catch (IOException e)
            {

            }
        }
        public static Configurations getinstance()
        {
            if (MYinstance==null)
            {
                MYinstance= new Configurations();
                return MYinstance;
            }
            else
            {
                return MYinstance;
            }
        }

        public static AMazeGenerator Newmazegenerator() {
            String generator = prop.getProperty("mazeGeneratingAlgorithm");
            switch (generator){
                case "My MazeGenerator" :
                    return new MyMazeGenerator();

                case "Simple Maze Generator" :
                    return new SimpleMazeGenerator();

                default:
                    return new EmptyMazeGenerator();
            }
        }

        public static ASearchingAlgorithm Newsearchalgo(){
            String algo = prop.getProperty("mazeSearchingAlgorithm");
            switch (algo){
                case "Best first search" :
                    return new BreadthFirstSearch();

                case "Breadth first search" :
                    return new BreadthFirstSearch();
                case "Depth first search" :
                    return new DepthFirstSearch();
                default:
                    return new DepthFirstSearch();
            }

        }
        public static int getThredsNumber(){
            {
                int num = Integer.parseInt(prop.getProperty("threadPoolSize"));
                return num;

            }

            }
    }


