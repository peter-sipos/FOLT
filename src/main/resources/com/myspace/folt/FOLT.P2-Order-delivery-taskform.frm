{"id":"e4289102-734f-43df-a10f-18f5cda52f49","name":"FOLT.P2-Order-delivery-taskform.frm","model":{"processName":"P2-Order-delivery","processId":"FOLT.P2-Order-delivery","name":"process","properties":[{"name":"deliverySuccessful","typeInfo":{"type":"BASE","className":"java.lang.Boolean","multiple":false},"metaData":{"entries":[]}},{"name":"locationInfo","typeInfo":{"type":"OBJECT","className":"com.myspace.folt.LocationInformation","multiple":false},"metaData":{"entries":[]}},{"name":"order","typeInfo":{"type":"OBJECT","className":"com.myspace.folt.Order","multiple":false},"metaData":{"entries":[]}}],"formModelType":"org.kie.workbench.common.forms.jbpm.model.authoring.process.BusinessProcessFormModel"},"fields":[{"nestedForm":"7fd1ac06-7740-46b8-8722-3bf9ff9b3452","container":"FIELD_SET","id":"field_417002673036959E11","name":"order","label":"","required":false,"readOnly":true,"validateOnChange":true,"helpMessage":"","binding":"order","standaloneClassName":"com.myspace.folt.Order","code":"SubForm","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.relations.subForm.definition.SubFormFieldDefinition"}],"layoutTemplate":{"version":3,"style":"FLUID","layoutProperties":{},"rows":[{"height":"12","properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.uberfire.ext.plugin.client.perspective.editor.layout.editor.HTMLLayoutDragComponent","properties":{"HTML_CODE":"\u003ch1\u003eOrder details\u003c/h1\u003e"},"parts":[]}]}]},{"height":"12","properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_417002673036959E11","form_id":"e4289102-734f-43df-a10f-18f5cda52f49"},"parts":[{"partId":"Legend Text","cssProperties":{}}]}]}]}]}}