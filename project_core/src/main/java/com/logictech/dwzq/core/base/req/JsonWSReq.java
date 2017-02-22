package com.logictech.dwzq.core.base.req;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class JsonWSReq {

    private String              funId;

    private Map<String, String> inputs;

    private List<String>        outputs;

    public String getFunId() {
        return funId;
    }

    public void setFunId(String funId) {
        this.funId = funId;
    }

    public Map<String, String> getInputs() {
        return inputs;
    }

    public void setInputs(Map<String, String> inputs) {
        this.inputs = inputs;
    }

    public List<String> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<String> outputs) {
        this.outputs = outputs;
    }

    @Override
    public String toString() {

        StringBuilder inputsBuilder = new StringBuilder();
        StringBuilder outputsBuilder = new StringBuilder();

        Set<String> inputsKeys = inputs.keySet();
        int i = 0;
        inputsBuilder.append("{");
        for (String inKey : inputsKeys) {
            String inValue = inputs.get(inKey);

            if (i < inputsKeys.size() - 1) {
                inputsBuilder.append(inKey + ":" + "\"" + inValue + "\"" + ",");
            }
            else {
                inputsBuilder.append(inKey + ":" + "\"" + inValue + "\"");
            }
            i++;
        }
        inputsBuilder.append("}");

        outputsBuilder.append("[");
        for (int j = 0; j < outputs.size(); j++) {
            if (j < outputs.size() - 1) {
                outputsBuilder.append("\"" + outputs.get(j) + "\"" + ",");
            }
            else {
                outputsBuilder.append("\"" + outputs.get(j) + "\"");
            }
        }
        outputsBuilder.append("]");

        return "{funId:" + "\"" + funId + "\"" + ", inputs:" + inputsBuilder.toString() + ", outputs:"
                + outputsBuilder.toString() + "}";
    }

}
