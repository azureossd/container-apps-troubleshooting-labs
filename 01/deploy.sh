#!/bin/bash

az deployment group create \
  --resource-group "$RESOURCE_GROUP" \
  --template-file ./arm.json 
      