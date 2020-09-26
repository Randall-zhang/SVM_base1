package Randall_SVM;

/**
 * SVM֧������������������
 * @author Randall_Zhang
 *
 */
public class Client {
	public static void main(String[] args){
		//ѵ���������ļ�·��
		String trainDataPath = "E:\\nlp\\machine_learning\\SVM_base\\src\\Randall_SVM\\trainInput.txt";
		//���������ļ�·��
		String testDataPath = "E:\\nlp\\machine_learning\\SVM_base\\src\\Randall_SVM\\testInput.txt";
		
		SVMTool tool = new SVMTool(trainDataPath);
		//�Բ������ݽ���svm֧������������
		tool.svmPredictData(testDataPath);
	}
}
